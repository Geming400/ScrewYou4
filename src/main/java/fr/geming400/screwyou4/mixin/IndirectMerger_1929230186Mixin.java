package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.IndirectMerger.class)
public class IndirectMerger_1929230186Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1922005522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922005522L))
            info.setReturnValue(-1224915102);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList__2090317606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090317606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes__1172695805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172695805L))
            info.setReturnValue(true);
    }


}
