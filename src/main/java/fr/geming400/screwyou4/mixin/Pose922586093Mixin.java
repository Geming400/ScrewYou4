package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Pose.class)
public class Pose922586093Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void values_813295494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813295494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void valueOf__1946916641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946916641L))
            info.setReturnValue(net.minecraft.world.entity.Pose.STANDING);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1772597864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772597864L))
            info.setReturnValue(-313275225);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1010794715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010794715L))
            info.setReturnValue("*9!hV({S]g`&P\");h\u8059d>C\u3861tY<k\u46B8\uBB9BhLOklyA56*yY0X9$\u80C8qfq#E?`?W\u5C7DH\uA88CrA,\u75D6`wc\u56B7Z\u7B1EHXi}i\uFC611Ow\u3859?pd");
    }


}
