package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TextureSlot.class)
public class TextureSlot_1886110885Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1638433383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638433383L))
            info.setReturnValue("Mx Q]di2HNDh'znrEMo_=\u83B3)L\u788F VbAC?\u4B94E#+1`GQisyb;!&2=J'9");
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private void getParent__1799819217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799819217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1261564802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261564802L))
            info.setReturnValue("e[\uB7E8:Xb]I/=3j}\u9065;_\u1ECCuM2\u6F84\"$5%v]6bA(\"v\u2CC9AXS}Ufj8BZ<<^?\uB528uetNJqL@qA<TbIW_h=c");
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private static void create_1491568781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491568781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private static void create_687785785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687785785L))
            info.setReturnValue(null);
    }


}
