package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.MatchTool.class)
public class MatchTool_619229825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2004742083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004742083L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__516230151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516230151L))
            info.setReturnValue("xKXmC4#^1lq#@0C渤/9츖⁐tQ볮`{|vIU%H蕹&TF*X[g{쎠MQ'+;U]㖅3Rⓧg/팓@zeN?柚iMgCᗛ|X0ᡁf6k3Xe");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_657492566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657492566L))
            info.setReturnValue(186063391);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1757719274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757719274L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_2004870547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004870547L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_864691246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864691246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toolMatches(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void toolMatches_961488776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961488776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1939883748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939883748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1209805662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209805662L))
            info.setReturnValue(null);
    }


}
