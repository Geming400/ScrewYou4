package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Half.class)
public class Half_1264611169Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2035034197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035034197L))
            info.setReturnValue("{n.");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/Half;", cancellable = true)
    private static void values__1211752174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211752174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Half;", cancellable = true)
    private static void valueOf__1523045973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523045973L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.Half.BOTTOM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1352819790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352819790L))
            info.setReturnValue("29\u2E2D{FlIH=o&s,Dlx/o@?9%C:W&ynj}W\u49CE;2|tUB3Osepfqy\u9026A\u4A8D\u1A90Ebx?=@Rl%\u9134g7ufCERhQ'8[");
    }


}
