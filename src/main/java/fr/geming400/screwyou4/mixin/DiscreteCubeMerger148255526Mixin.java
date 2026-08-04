package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.DiscreteCubeMerger.class)
public class DiscreteCubeMerger148255526Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_186517772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186517772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList__705204605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705204605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes_921477845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921477845L))
            info.setReturnValue(null);
    }


}
