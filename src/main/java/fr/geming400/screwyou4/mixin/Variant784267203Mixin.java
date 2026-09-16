package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.class)
public class Variant784267203Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void values__1250477872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250477872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void valueOf_243892009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243892009L))
            info.setReturnValue(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.SALT);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1910916754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910916754L))
            info.setReturnValue(1128868774);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void byId_1904786194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904786194L))
            info.setReturnValue(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_872475825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872475825L))
            info.setReturnValue("Y>9iFs\u31C03\u653ATR9]SLOJ|8x-TA^,j%3+6|5aMnps u_YE@;tu\u38E4K\u0397v\uBCD4=E<ycOO$cdV]pz");
    }


}
