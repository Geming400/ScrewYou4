package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ChunkIdentification.class)
public class ChunkIdentification_1195778243Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_287151974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287151974L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1966201767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966201767L))
            info.setReturnValue("Hw1\u8EAA_Q:`,\uBB61Kmq\"E9?\u4FD89<[&ny\u6559\uA791\u8E9Eq# (rq78nP'&gC:'>a,f<00cUQ\u25371'7AC5E^zt%Mr\u1FC8\u9778\uA6A1{i;+o=xIOB\uD1FE\"#\u7BCDv%<[e9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1753130333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753130333L))
            info.setReturnValue(-1658415769);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_374571312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374571312L))
            info.setReturnValue(1231044764);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ChunkIdentification;", cancellable = true)
    private static void from__1546058373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546058373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_431829614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431829614L))
            info.setReturnValue(277434265);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level__1806253873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806253873L))
            info.setReturnValue("5M:Q=/\uD4DD\u92D9lr\u9FEBO\uD7DDa\uCF6BKT6#\"[O9\u6143m|L/K>\u1D5DuN<yW-KQ5_.\u5E21c\u8B51 *a\u61EE;y\u7019fN.`#t");
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/lang/String;", cancellable = true)
    private void dimension__501801679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501801679L))
            info.setReturnValue(">dR.]gM^-\uB591vt1%oN} d<-Cy[_'t5*'4aauiDXz\"A]ltb9)\uBDAB \u1127SbW%,A\u9D80S\uAC43/F'*0]scf}\u48A2y]w,\uD42ECQK7j$vP;|0&");
    }


}
