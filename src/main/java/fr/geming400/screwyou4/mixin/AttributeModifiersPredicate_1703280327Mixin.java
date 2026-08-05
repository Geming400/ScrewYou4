package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AttributeModifiersPredicate.class)
public class AttributeModifiersPredicate_1703280327Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/Optional;", cancellable = true)
    private void modifiers_1948741748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948741748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1206174711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206174711L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_567820351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567820351L))
            info.setReturnValue("10譫Xd0pU*/밭Yb/BV=hn$QB㬙쎏9'5mW.KZ*h@FWr=ⓤ2a_V^♌.Ne螺B㖒R쥶P[:<_5긅+扇bVG78n#4q,uJV⇮zᤀlLtm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1741543068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741543068L))
            info.setReturnValue(-1240600766);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1323368107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323368107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/ItemAttributeModifiers;)Z", cancellable = true)
    private void matches_1184908708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184908708L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1206046247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206046247L))
            info.setReturnValue(true);
    }


}
