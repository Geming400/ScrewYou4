package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Pose.class)
public class Pose922586093Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void values_1804678116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804678116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void valueOf__1240671993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240671993L))
            info.setReturnValue(net.minecraft.world.entity.Pose.SNIFFING);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_960848339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960848339L))
            info.setReturnValue(-1228919913);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__212874378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212874378L))
            info.setReturnValue("\uFCC8t\"aM\u305Eu\";rue5i-\uFA30(Rq[tp:pMu\uAEEF\uB8BByELEOYg+@zE\uFA5D96g]\u2FBC!\u5EEEX+j\uB026Y:wCa\u54DF\uB1CB^\u7D25\uB407wtv\u3CCA1\u2F62r[tUd\u13B5\uB098k00x#t.o)\u122AQ");
    }


}
