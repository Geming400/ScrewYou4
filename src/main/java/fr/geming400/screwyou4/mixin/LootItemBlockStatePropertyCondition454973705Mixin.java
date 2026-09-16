package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition.class)
public class LootItemBlockStatePropertyCondition454973705Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__453652563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453652563L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1225397230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225397230L))
            info.setReturnValue("\u23953 EojW0eQ\uCDA1\u5BB0(;Oyg|yaM\u1B95o\uC2DE%\u0A73Z;kOBfU@d<A*f\u7901CCf.E>MFj&\u249Fqd");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1012325796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012325796L))
            info.setReturnValue(612612586);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__950638771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950638771L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1281998006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281998006L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties__1953124630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953124630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/core/Holder;", cancellable = true)
    private void block_1920154328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920154328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1234476933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234476933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1521418959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521418959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBlockStateProperties(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemBlockStatePropertyCondition$Builder;", cancellable = true)
    private static void hasBlockStateProperties__963084260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963084260L))
            info.setReturnValue(null);
    }


}
