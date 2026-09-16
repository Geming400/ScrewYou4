package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SummonedEntityTrigger.TriggerInstance.class)
public class TriggerInstance_475203576Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__433422693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433422693L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1245627100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245627100L))
            info.setReturnValue("}j\u6732U\u29341z7@\"\u941Ao$sQ|V0DcY}Q^jJ\u97B62\u1898)jlKAb\u584E`9L\"*kG<}0: h+'J3JMNkq3c {d9WCJbq\uB605\uC3482\"{\uC9E32Y\uAF70h_\u352CS\u103AsSt6*\uCEFA0gi)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1032555666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032555666L))
            info.setReturnValue(-857587799);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1189272762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189272762L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_735376681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(735376681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__755449466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755449466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summonedEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void summonedEntity_590207264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590207264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_565027976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565027976L))
            info.setReturnValue(null);
    }


}
