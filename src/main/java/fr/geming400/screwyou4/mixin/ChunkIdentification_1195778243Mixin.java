package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ChunkIdentification.class)
public class ChunkIdentification_1195778243Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1713676795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1713676795L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_60318267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60318267L))
            info.setReturnValue("P\u0E8F</:5rag\u8DF3^n)Oq\uB097CQK$y)aqg|/!u;v<KjvEcP\u83B1FAsh0B;0?s\u255Ey8H\u40CDv\u86EAFD{\uF91DnIg9\u5DBE.YQm\u59AAL'/|}[g-d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1234040984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234040984L))
            info.setReturnValue(1814875018);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1234040488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234040488L))
            info.setReturnValue(417467013);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ChunkIdentification;", cancellable = true)
    private static void from__1101765167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101765167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_1234040488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234040488L))
            info.setReturnValue(417467013);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level_60317771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60317771L))
            info.setReturnValue("U?-JL\u40AC\u0CA7\u8225[{\uD329Vz9#3f})5U1{:z");
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/lang/String;", cancellable = true)
    private void dimension_60317771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60317771L))
            info.setReturnValue("U?-JL\u40AC\u0CA7\u8225[{\uD329Vz9#3f})5U1{:z");
    }


}
