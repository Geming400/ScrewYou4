package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition.class)
public class LootItemKilledByPlayerCondition1518557885Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__218413826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218413826L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_112945409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112945409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "killedByPlayer()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void killedByPlayer_2074174857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074174857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1709964157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709964157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1996906183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996906183L))
            info.setReturnValue(null);
    }


}
