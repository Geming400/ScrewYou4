package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidModel.Deserializer.class)
public class Deserializer_760305460Mixin {
        @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;", cancellable = true)
    private void deserialize_1783012085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783012085L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/client/resources/model/cuboid/CuboidModel;", cancellable = true)
    private void deserialize_261555446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261555446L))
            info.setReturnValue(null);
    }


}
