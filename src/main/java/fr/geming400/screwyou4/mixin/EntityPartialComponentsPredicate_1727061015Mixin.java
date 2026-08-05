package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPartialComponentsPredicate.class)
public class EntityPartialComponentsPredicate_1727061015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1182394023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182394023L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_591601039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591601039L))
            info.setReturnValue("n{'^t@%bg&dFD{6,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1765323756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765323756L))
            info.setReturnValue(-1947617638);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__227130897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227130897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "predicates()Ljava/util/Map;", cancellable = true)
    private void predicates__277562626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277562626L))
            info.setReturnValue(null);
    }


}
