package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Llama.Variant.class)
public class Variant_229108384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void values__370489882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370489882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void valueOf__1430663059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430663059L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Llama.Variant.CREAMY);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1429215212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429215212L))
            info.setReturnValue(-429209963);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void byId_2086597476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086597476L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Llama.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_317317005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317317005L))
            info.setReturnValue("k3[6R0s(M1\u825FP/6&mX`\u97E6>");
    }


}
