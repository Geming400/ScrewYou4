package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.MatchTool.class)
public class MatchTool_619229825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__289396444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289396444L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1389653349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389653349L))
            info.setReturnValue("cFgL@\u6151'l<V#}\u6043+I\u4821Kbbrq9;<\u21B3\uB619svh{u \uA254\".-\u973C*!+6xw\u8BC9[@wr\u58207GT\uB52CcPFl\u468F'CA\uA40E{4'oMu\uA7A1\u984Cezv1|?\u380E+uJm\uAE1Ff\u985C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1176581915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176581915L))
            info.setReturnValue(2059115658);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__786382652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786382652L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1117741887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117741887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_848091365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848091365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1685675078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685675078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toolMatches(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void toolMatches_1146011843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146011843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1398733052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398733052L))
            info.setReturnValue(null);
    }


}
