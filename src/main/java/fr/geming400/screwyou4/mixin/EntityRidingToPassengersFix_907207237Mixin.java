package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityRidingToPassengersFix.class)
public class EntityRidingToPassengersFix_907207237Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1902564225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902564225L))
            info.setReturnValue(null);
    }


}
