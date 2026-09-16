package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeUnlockedTrigger.TriggerInstance.class)
public class TriggerInstance_168038790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__740587479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740587479L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_938462314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938462314L))
            info.setReturnValue("{[%%.'\u8AA1=e&(n\uA7A1Bz?:@+Y_4a<}sH4J?&\u6475!}z\"UCjD/Qe\u5E9A\u4528Q'A\uC4C2IO6H>:W\u5D15t&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_725390880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725390880L))
            info.setReturnValue(-249880196);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeHolder;)Z", cancellable = true)
    private void matches_1882448316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882448316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipe__1384813336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384813336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1062614252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062614252L))
            info.setReturnValue(null);
    }


}
