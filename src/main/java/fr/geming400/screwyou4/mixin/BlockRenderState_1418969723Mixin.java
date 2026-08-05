package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BlockDisplay.BlockRenderState.class)
public class BlockRenderState_1418969723Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1490485315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490485315L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_283509747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283509747L))
            info.setReturnValue("s[hdp)SAqrd\u9C38,0t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1457232464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457232464L))
            info.setReturnValue(1370979106);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState__876789144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876789144L))
            info.setReturnValue(null);
    }


}
