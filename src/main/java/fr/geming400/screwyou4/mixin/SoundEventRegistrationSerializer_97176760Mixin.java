package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer.class)
public class SoundEventRegistrationSerializer_97176760Mixin {
        @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/client/resources/sounds/SoundEventRegistration;", cancellable = true)
    private void deserialize_1639266583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639266583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;", cancellable = true)
    private void deserialize_1119883385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119883385L))
            info.setReturnValue(new java.lang.Object());
    }


}
