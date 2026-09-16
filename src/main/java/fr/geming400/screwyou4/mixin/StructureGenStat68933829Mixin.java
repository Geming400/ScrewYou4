package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.StructureGenStat.class)
public class StructureGenStat68933829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__839692439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839692439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_839357354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839357354L))
            info.setReturnValue("]l+`\uFF90YsM0\uFB69-6mAeb>\u4040K>\u01FC }ku\u98B5)\u2402f/O\u6551`(jqY6<\uCA21iA\u2C87(}vj4\u6624\uA5BCgLyli\u18ECd\u4E2EiL.&p}o&\u91965`log TJZ(m\u5575AW\u1BE3j\uB5DBDY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_626285920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626285920L))
            info.setReturnValue(1253149173);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/StructureGenStat;", cancellable = true)
    private static void from__273093054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273093054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1069549470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069549470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level_1361869010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361869010L))
            info.setReturnValue("\u29EC<)A))G$pzi1i$Vh\u75B9c:\"&)WtG#P[wiPYqX%u9\u0950q&pM<r7/,\u367E`)1_\uCF9C2%B#\u0FD4$d'\u77090}J\uB199Th)L\u854F;)u\u2B56\u4CFEhvKp\u6C00N1\u5298");
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__1796687849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796687849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "success()Z", cancellable = true)
    private void success__636143527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636143527L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "structureName()Ljava/lang/String;", cancellable = true)
    private void structureName_1189566572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189566572L))
            info.setReturnValue("\uC025=J7\uD2A9M1S6hm wE|");
    }


}
