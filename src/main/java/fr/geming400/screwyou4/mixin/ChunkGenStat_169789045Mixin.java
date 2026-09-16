package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ChunkGenStat.class)
public class ChunkGenStat_169789045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__738837224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738837224L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_940212569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940212569L))
            info.setReturnValue("4Y\u93DD *k+^2''0,\u7B4A#Eek\"CeBta{\u66BAW5-sXVzvYLd\u04A5pm\u7975cWm][7\u6A23vg\uD20F)\uCD75D}|hFW%\u326D=&3uj\u7041>1r:T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_727141135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727141135L))
            info.setReturnValue(1112256110);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ChunkGenStat;", cancellable = true)
    private static void from_1033660139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033660139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void status_1143718612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143718612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1170404685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170404685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level_1462724225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462724225L))
            info.setReturnValue("\u59C97\u7759x\uF9FA?t;s,<}|,\u7DDB)8\u8C852*\u876B7JlX\uAEC0lL \u3E2B\u241B)jKd;0.J{01bBp%0*5xOAcJ\uB2D9*x\u409566=v%T6JsM\u9254zD(/lr[Vn^#:");
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__1695832634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695832634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldPos()Lnet/minecraft/server/level/ColumnPos;", cancellable = true)
    private void worldPos_682686313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682686313L))
            info.setReturnValue(null);
    }


}
