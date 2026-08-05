package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackTheFlatteningFix.class)
public class ItemStackTheFlatteningFix198494349Mixin {
        @Inject(at = @At("HEAD"), method = "updateItem(Ljava/lang/String;I)Ljava/lang/String;", cancellable = true)
    private static void updateItem__1442547905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442547905L))
            info.setReturnValue("+c\uB5D56gJ`d2YCdC&");
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1683690184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683690184L))
            info.setReturnValue(null);
    }


}
