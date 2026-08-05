package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundEventRegistrationSerializer.class)
public class SoundEventRegistrationSerializer_97176760Mixin {
        @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;", cancellable = true)
    private void deserialize_1062890010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062890010L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/client/resources/sounds/SoundEventRegistration;", cancellable = true)
    private void deserialize__2113379016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113379016L))
            info.setReturnValue(null);
    }


}
