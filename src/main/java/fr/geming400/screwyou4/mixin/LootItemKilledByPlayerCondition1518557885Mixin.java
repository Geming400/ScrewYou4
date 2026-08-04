package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition.class)
public class LootItemKilledByPlayerCondition1518557885Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1390768688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390768688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__858391213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858391213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1040555687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040555687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killedByPlayer()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void killedByPlayer__863047010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863047010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__310477601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310477601L))
            info.setReturnValue(null);
    }


}
