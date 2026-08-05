package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.NamespacedSchema.class)
public class NamespacedSchema1982564334Mixin {
        @Inject(at = @At("HEAD"), method = "ensureNamespaced(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void ensureNamespaced__1099660891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099660891L))
            info.setReturnValue(" \uD0393c");
    }

    @Inject(at = @At("HEAD"), method = "namespacedString()Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void namespacedString__1506217537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506217537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChoiceType(Lcom/mojang/datafixers/DSL$TypeReference;Ljava/lang/String;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private void getChoiceType_277315595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277315595L))
            info.setReturnValue(null);
    }


}
