package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.class)
public class Type_1337041860Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private static void values_2086598630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086598630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private static void valueOf_726897737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726897737L))
            info.setReturnValue(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.PORTAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_201581388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201581388L))
            info.setReturnValue("&UX_].pF=]I8|Y}.2j|z땜r\"}}BbVI]dqWJ@j3sNTBUR#aꢮD8v⋏V課3u!唔햪U7H&0ꟾ]E)BfͰ&{'r|F2VꙒ/ b S\"DdFbD_1SN");
    }


}
