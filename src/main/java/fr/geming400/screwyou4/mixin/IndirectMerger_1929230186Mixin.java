package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.IndirectMerger.class)
public class IndirectMerger_1929230186Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1967492431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967492431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList_1075770054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075770054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes__1592514792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592514792L))
            info.setReturnValue(null);
    }


}
