package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.SavedPosition.class)
public class SavedPosition1745565376Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1163889661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163889661L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_610105401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610105401L))
            info.setReturnValue(")gU2`^9$護ֶ%$#r?t훓LZ㿜r|XV&9PJ_dz.:<+Gg|VkMzV捛-x 9$رE,2eZh?c?Ji8M;2aD䜹*q{ᓶ+b/$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1783828118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783828118L))
            info.setReturnValue(-956763393);
    }

    @Inject(at = @At("HEAD"), method = "position()Ljava/util/Optional;", cancellable = true)
    private void position_1991026798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991026798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/util/Optional;", cancellable = true)
    private void dimension_1991026798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991026798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Ljava/util/Optional;", cancellable = true)
    private void rotation_1991026798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991026798L))
            info.setReturnValue(null);
    }


}
