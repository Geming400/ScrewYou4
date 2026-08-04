package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.StatePropertiesPredicate.Builder.class)
public class Builder1498651510Mixin {
        @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private static void properties_1060578407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060578407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/Optional;", cancellable = true)
    private void build_1744112932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744112932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;I)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_591978104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591978104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_2080858892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080858892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Z)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty__2032999993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032999993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_676377283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676377283L))
            info.setReturnValue(null);
    }


}
