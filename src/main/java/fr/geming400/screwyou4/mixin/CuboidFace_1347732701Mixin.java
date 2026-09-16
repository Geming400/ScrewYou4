package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidFace.class)
public class CuboidFace_1347732701Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_439106432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439106432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2118156225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118156225L))
            info.setReturnValue("[s0:`d\u0FA5l\u5CB9L yF:)]FD\u21D7p)Wy3\u39B8.\"O\u3784]Uv`6;t\u6070_: a[\u2BF8Jz:q\"{\u89908s6ysL)a`n;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1905084791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905084791L))
            info.setReturnValue(350051124);
    }

    @Inject(at = @At("HEAD"), method = "getU(Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;Lcom/mojang/math/Quadrant;I)F", cancellable = true)
    private static void getU_1489455039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489455039L))
            info.setReturnValue(6.621725E8F);
    }

    @Inject(at = @At("HEAD"), method = "uvs()Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;", cancellable = true)
    private void uvs_488143778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488143778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cullForDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void cullForDirection_1262689967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262689967L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "tintIndex()I", cancellable = true)
    private void tintIndex__491186549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491186549L))
            info.setReturnValue(-774348190);
    }

    @Inject(at = @At("HEAD"), method = "texture()Ljava/lang/String;", cancellable = true)
    private void texture_1679967040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679967040L))
            info.setReturnValue("4\uF91CWpE a@X7|\uA2EALa\u7B32\"`O=Y2w(}uh1\u34BB!`s3b \u19D5HLQi");
    }

    @Inject(at = @At("HEAD"), method = "getV(Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;Lcom/mojang/math/Quadrant;I)F", cancellable = true)
    private static void getV_1047700544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047700544L))
            info.setReturnValue(6.621725E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void rotation__1907318924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907318924L))
            info.setReturnValue(com.mojang.math.Quadrant.R0);
    }


}
