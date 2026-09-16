package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.BlockDestructionProgress.class)
public class BlockDestructionProgress_1146398198Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_237771433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237771433L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1703749792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703749792L))
            info.setReturnValue(-787454383);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/server/level/BlockDestructionProgress;)I", cancellable = true)
    private void compareTo_1356611197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356611197L))
            info.setReturnValue(-1214853490);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__745705737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745705737L))
            info.setReturnValue(1235427357);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__511925398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511925398L))
            info.setReturnValue(-278153783);
    }

    @Inject(at = @At("HEAD"), method = "setProgress(I)V", cancellable = true)
    private void setProgress_1039232656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039232656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1635963928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635963928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgress()I", cancellable = true)
    private void getProgress_756730392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756730392L))
            info.setReturnValue(-1438396286);
    }

    @Inject(at = @At("HEAD"), method = "updateTick(J)V", cancellable = true)
    private void updateTick_165804584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165804584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatedRenderTick()J", cancellable = true)
    private void getUpdatedRenderTick_1882017764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882017764L))
            info.setReturnValue(8694057322057632895L);
    }


}
