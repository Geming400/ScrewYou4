package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Data.class)
public class Data_764964034Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2144491004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144491004L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__370495942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370495942L))
            info.setReturnValue("F.]\u5881{4sH2H`n(j&5^6!WCXH_O>q\uBAD1.a.VCBZ1?uE4");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values__1239659607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239659607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_803226775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803226775L))
            info.setReturnValue(-1049255998);
    }


}
