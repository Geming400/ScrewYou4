package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapDecoration.class)
public class MapDecoration512780302Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_1330717511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330717511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type__1031247472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031247472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__395845966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395845966L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1283203827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283203827L))
            info.setReturnValue("\u898FN?a\")AV!z\u78AC\u8C87\"\u439D|\u3A86+tB\uAA07\u7121G|ZQ\u5372;\uCF66T\uB786#@\u06CF)I\u1948:5Q;\uA6A4!b1\u5785\uC3E4\"{\uF905'<f-K\u6021cb*G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1070132393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070132393L))
            info.setReturnValue(-2016185400);
    }

    @Inject(at = @At("HEAD"), method = "x()B", cancellable = true)
    private void x__308433355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308433355L))
            info.setReturnValue(-38);
    }

    @Inject(at = @At("HEAD"), method = "y()B", cancellable = true)
    private void y__279804204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279804204L))
            info.setReturnValue(-127);
    }

    @Inject(at = @At("HEAD"), method = "rot()B", cancellable = true)
    private void rot_417593398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417593398L))
            info.setReturnValue(112);
    }

    @Inject(at = @At("HEAD"), method = "renderOnFrame()Z", cancellable = true)
    private void renderOnFrame__1855458195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855458195L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSpriteLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getSpriteLocation__161834523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161834523L))
            info.setReturnValue(null);
    }


}
