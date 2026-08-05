package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TextureSlot.class)
public class TextureSlot_1886110885Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_750650413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750650413L))
            info.setReturnValue("Vrf@婎븧ltI 3mK2<[w閞9vᷱ勆)茒N$|]z{%PpR*<vF?:");
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private void getParent_1055794319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055794319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_750650413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750650413L))
            info.setReturnValue("Vrf@婎븧ltI 3mK2<[w閞9vᷱ勆)茒N$|]z{%PpR*<vF?:");
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private static void create_97622161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97622161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureSlot;", cancellable = true)
    private static void create__1582362307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582362307L))
            info.setReturnValue(null);
    }


}
