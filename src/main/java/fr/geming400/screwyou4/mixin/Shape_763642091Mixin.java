package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.FireworkExplosion.Shape.class)
public class Shape_763642091Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getName__1095620204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095620204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void values__256988743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256988743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void valueOf_1180113088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180113088L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.SMALL_BALL);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__894681505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894681505L))
            info.setReturnValue(-691736536);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void byId__1439438793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439438793L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.BURST);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_851850712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851850712L))
            info.setReturnValue("AS8KhQ}cWM<@D\u3603");
    }


}
