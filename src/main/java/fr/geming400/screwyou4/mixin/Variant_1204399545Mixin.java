package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.parrot.Parrot.Variant.class)
public class Variant_1204399545Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void values_775296163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775296163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void valueOf__1410514746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410514746L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.RED_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1242661790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242661790L))
            info.setReturnValue(803761360);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void byId_1345088565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345088565L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_68939073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68939073L))
            info.setReturnValue("E?.%\u7100wo,1fm6{=U\"}e`c\uCB09 `a)-L! 2Z]\u7020e:B0\u3482e5%n\u9110z*ZJkSMw7e\uA2A9*b%T}\u532C\u7672u\u2D1D%y-HJ/4&<b3&)\u4D191\uA832O28uqP}\u2ED6\u8171");
    }


}
