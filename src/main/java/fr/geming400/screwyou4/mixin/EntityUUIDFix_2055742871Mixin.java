package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityUUIDFix.class)
public class EntityUUIDFix_2055742871Mixin {
        @Inject(at = @At("HEAD"), method = "updateEntityUUID(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void updateEntityUUID__332106547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332106547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateLivingEntity(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void updateLivingEntity__332106547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332106547L))
            info.setReturnValue(null);
    }


}
