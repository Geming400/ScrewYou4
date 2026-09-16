package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworkExplosionPredicate.class)
public class FireworkExplosionPredicate1052693811Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_144067543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144067543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1823117336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823117336L))
            info.setReturnValue("\u89A8%tdK&G\u260C>\uBA37dS\u6935eaM\u7509odLK&LrW?#LI@^N)|%U?&be\uCCD6\u4190LUE\"-@\u27AAm\u7CED]9\u9F42");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1610045902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610045902L))
            info.setReturnValue(-197183643);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1525758951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525758951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/FireworkExplosion;)Z", cancellable = true)
    private void matches_1315534805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315534805L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__415443533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415443533L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/FireworkExplosionPredicate$FireworkPredicate;", cancellable = true)
    private void predicate__1795624162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795624162L))
            info.setReturnValue(null);
    }


}
