package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.ComponentMatches.class)
public class ComponentMatches_699925092Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1580990691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580990691L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1859188481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859188481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2085437350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085437350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__435534884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435534884L))
            info.setReturnValue("7^\uA2EAcz!R#H.b.;'`c)f7 ss CwWW\u88F5 \u41F8]O\uB59B\u6781L5ji#L|kw\u80C1\u4159vD%et,9d2[\u5F16=0\u3EA7iQMV6#8\uB16E9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_738187833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738187833L))
            info.setReturnValue(739223432);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/DataComponentPredicate$Single;", cancellable = true)
    private void predicate_1848648132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848648132L))
            info.setReturnValue(null);
    }


}
