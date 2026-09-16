package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemTransforms.class)
public class ItemTransforms_1310740794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_402114525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402114525L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2081164318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081164318L))
            info.setReturnValue("7eHn\uC0E9A3\u65F8=%E!L-\u3B3C,OnzIy[U14>\uB8C65^f|eJ29sAq\uCDCAmjwj]a@\u3BCD_!z}}Md[\u7692.)?%|$8-g1f1MxDgkbB4\uFE36&\u7480;b\u5BE53L4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1868092884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868092884L))
            info.setReturnValue(1351903990);
    }

    @Inject(at = @At("HEAD"), method = "fixed()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void fixed_1686140197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686140197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void head_476541241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476541241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTransform(Lnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void getTransform__1874072549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874072549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonRightHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void thirdPersonRightHand__97987382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97987382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonLeftHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void thirdPersonLeftHand__1316846585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316846585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstPersonLeftHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void firstPersonLeftHand_1762958686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762958686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedFromBottom()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void fixedFromBottom__2033531664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033531664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstPersonRightHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void firstPersonRightHand_886695507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886695507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ground()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void ground_1965984946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965984946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gui()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void gui_889630334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889630334L))
            info.setReturnValue(null);
    }


}
