package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.NamespacedSchema.class)
public class NamespacedSchema1982564334Mixin {
        @Inject(at = @At("HEAD"), method = "namespacedString()Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void namespacedString_706194969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706194969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChoiceType(Lcom/mojang/datafixers/DSL$TypeReference;Ljava/lang/String;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private void getChoiceType__2142783046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142783046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureNamespaced(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void ensureNamespaced_257591276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257591276L))
            info.setReturnValue("E\u3139(s\u28490t6X.");
    }


}
