package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.StructureGenStat.class)
public class StructureGenStat68933829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1454446088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454446088L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1066526146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066526146L))
            info.setReturnValue("V承qd^Q|^D{Q-6$2}P?EnIFq蘆f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_107196571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107196571L))
            info.setReturnValue(-192444391);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/StructureGenStat;", cancellable = true)
    private static void from_128146860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128146860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1332098570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332098570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level__1066526642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066526642L))
            info.setReturnValue("tnᘟ!ofRO7覿t/D뭸BO{VKQ:us4,VZUMyG&{(`_.pj 栈i-(pFIc<C%wSQ vh郆/]'3;?毹匤傐");
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__820165008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820165008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "success()Z", cancellable = true)
    private void success_107212412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107212412L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "structureName()Ljava/lang/String;", cancellable = true)
    private void structureName__1066526642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066526642L))
            info.setReturnValue("tnᘟ!ofRO7覿t/D뭸BO{VKQ:us4,VZUMyG&{(`_.pj 栈i-(pFIc<C%wSQ vh郆/]'3;?毹匤傐");
    }


}
