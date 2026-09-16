package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.DiscreteCubeMerger.class)
public class DiscreteCubeMerger148255526Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_591987115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591987115L))
            info.setReturnValue(-1046580205);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList_423675031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423675031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes_1341296832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341296832L))
            info.setReturnValue(true);
    }


}
