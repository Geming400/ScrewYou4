package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Llama.Variant.class)
public class Variant_229108384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void values_602959816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602959816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void valueOf__1268665531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268665531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_267370629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267370629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__906352088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906352088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private static void byId__1595417098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595417098L))
            info.setReturnValue(null);
    }


}
