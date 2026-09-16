package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBrainDump.class)
public class DebugBrainDump25501763Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_834768919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834768919L))
            info.setReturnValue("z%usT*+*_`U'\uD2CAbdByWm#\uD580q[?j5(BR\u9FFCix^R\uBB90y\u96528?sN\uA4C1#.\uD10F+>Wp#\uACDAx:Q7");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__883124505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883124505L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_795925288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795925288L))
            info.setReturnValue("h>,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_582853854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582853854L))
            info.setReturnValue(-134657054);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__1403484895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1403484895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xp()I", cancellable = true)
    private void xp__1898479055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898479055L))
            info.setReturnValue(-2084964708);
    }

    @Inject(at = @At("HEAD"), method = "maxHealth()F", cancellable = true)
    private void maxHealth_371883526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371883526L))
            info.setReturnValue(8.80551E8F);
    }

    @Inject(at = @At("HEAD"), method = "hasPoi(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasPoi_200962334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200962334L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "inventory()Ljava/lang/String;", cancellable = true)
    private void inventory__1154364376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154364376L))
            info.setReturnValue("pf<Dc5m<>x;IS{g(#n%P\u47D5cXx[|.g\uC9D8YZ/}TC@Jn=2X/y](ro\u2841,<o1Z\u494E`/}K/P0\uD100]J\u63A3em\u9D22VH\u2CA3\u4A83>\uD321/@XF\u809ELc:EO5\uD541!T\u8C27Y5");
    }

    @Inject(at = @At("HEAD"), method = "pois()Ljava/util/Set;", cancellable = true)
    private void pois__1767950244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767950244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "health()F", cancellable = true)
    private void health__1939406326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939406326L))
            info.setReturnValue(8.80551E8F);
    }

    @Inject(at = @At("HEAD"), method = "takeBrainDump(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/util/debug/DebugBrainDump;", cancellable = true)
    private static void takeBrainDump_1266342261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266342261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profession()Ljava/lang/String;", cancellable = true)
    private void profession_1470045128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470045128L))
            info.setReturnValue("BLBeeB\uB323Hpl8FJt9=EfYThU\u2778^A,z,dUMt\u3A17%\u3AFA+");
    }

    @Inject(at = @At("HEAD"), method = "hasPotentialPoi(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasPotentialPoi__495679660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495679660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "potentialPois()Ljava/util/Set;", cancellable = true)
    private void potentialPois_752815710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752815710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gossips()Ljava/util/List;", cancellable = true)
    private void gossips__951884201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951884201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memories()Ljava/util/List;", cancellable = true)
    private void memories_91028050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91028050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsGolem()Z", cancellable = true)
    private void wantsGolem__1355017711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355017711L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "angerLevel()I", cancellable = true)
    private void angerLevel__392485748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392485748L))
            info.setReturnValue(-557796392);
    }

    @Inject(at = @At("HEAD"), method = "behaviors()Ljava/util/List;", cancellable = true)
    private void behaviors_947235924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947235924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activities()Ljava/util/List;", cancellable = true)
    private void activities__1421864480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421864480L))
            info.setReturnValue(null);
    }


}
