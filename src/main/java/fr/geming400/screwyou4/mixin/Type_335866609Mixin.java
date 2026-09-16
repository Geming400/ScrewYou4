package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type.class)
public class Type_335866609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__572759660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572759660L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1106290133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106290133L))
            info.setReturnValue(";\uA74Di)0C[v1J\u0D660KgH.+\uFF8Aw(HF<-t2sc\u3280NI0VQiQ7+&eW'&\"ojk#^h3p-o|/{9h\u3C81\uBB56");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_893218699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893218699L))
            info.setReturnValue(1301689652);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id_2038056018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038056018L))
            info.setReturnValue(null);
    }


}
