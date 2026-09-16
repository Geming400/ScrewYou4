package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.LoadResult.class)
public class LoadResult769440234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__139186034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139186034L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1539863759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539863759L))
            info.setReturnValue("CE\u2A28Xny_CJ;>\u2961T@'d[\u02DC\u23F1\u52ADM\uCAA1U5GG@RQ#4'$I}ERVs@<]9,\u2AE8\uC166^RAYk\u74AER1\u6EC5]\u0925eDc':Lq\u872ABGz\u16E2R>\"bf$p8m%PRoXL\uCFAAy!8i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1326792325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326792325L))
            info.setReturnValue(-1478800499);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__930862180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930862180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/Map;", cancellable = true)
    private void tags_1824773145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824773145L))
            info.setReturnValue(null);
    }


}
