package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.StatePropertiesPredicate.Builder.class)
public class Builder1498651510Mixin {
        @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private static void properties_961832218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961832218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/Optional;", cancellable = true)
    private void build_887089554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887089554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;I)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_23300615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23300615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty__897001763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897001763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Z)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_1693289814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693289814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProperty(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;", cancellable = true)
    private void hasProperty_1090434836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090434836L))
            info.setReturnValue(null);
    }


}
