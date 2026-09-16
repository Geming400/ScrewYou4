package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.TargetPoint.class)
public class TargetPoint_105674678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__802951591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802951591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_876098202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876098202L))
            info.setReturnValue("\u1EF7a c.au\uB6CE\u654CNFpT]U\u26BEICH\u29C1\uF9E3`\uCCB3\u3583iF$xL!17d\u8AE5C9]\uC6D98/G9STcav N\u61A6vt[/7[\u3740c\u231EnGx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_663026768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663026768L))
            info.setReturnValue(472526073);
    }

    @Inject(at = @At("HEAD"), method = "depth()J", cancellable = true)
    private void depth_278055033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278055033L))
            info.setReturnValue(-1681501210805540589L);
    }

    @Inject(at = @At("HEAD"), method = "temperature()J", cancellable = true)
    private void temperature_26006632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26006632L))
            info.setReturnValue(-7253052145234962354L);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()J", cancellable = true)
    private void continentalness__1247407258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247407258L))
            info.setReturnValue(-5992752653613891210L);
    }

    @Inject(at = @At("HEAD"), method = "humidity()J", cancellable = true)
    private void humidity_1449331849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449331849L))
            info.setReturnValue(4890544701030857146L);
    }

    @Inject(at = @At("HEAD"), method = "erosion()J", cancellable = true)
    private void erosion_754729125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754729125L))
            info.setReturnValue(3739737347387427934L);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()J", cancellable = true)
    private void weirdness_1001098552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001098552L))
            info.setReturnValue(-5470622084128191902L);
    }


}
