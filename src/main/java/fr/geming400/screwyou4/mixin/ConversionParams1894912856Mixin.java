package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ConversionParams.class)
public class ConversionParams1894912856Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/ConversionType;", cancellable = true)
    private void type__1730007113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730007113L))
            info.setReturnValue(net.minecraft.world.entity.ConversionType.SINGLE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_986286588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986286588L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1629630915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629630915L))
            info.setReturnValue("\u0CA6M=Q3&y[HG=h&3<lvuT\u3711\uB9B3\u0F7EWZ^,x B08\u5BD2+Dowr>9!l<-hw;g=KJ*h'nt\u62B7A$^l$[\u1860ELal8q?>9lc-(Z-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1842702349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842702349L))
            info.setReturnValue(315297630);
    }

    @Inject(at = @At("HEAD"), method = "single(Lnet/minecraft/world/entity/Mob;ZZ)Lnet/minecraft/world/entity/ConversionParams;", cancellable = true)
    private static void single__1191360961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191360961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "team()Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void team_645185860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645185860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preserveCanPickUpLoot()Z", cancellable = true)
    private void preserveCanPickUpLoot__1461804633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461804633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keepEquipment()Z", cancellable = true)
    private void keepEquipment__94800090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94800090L))
            info.setReturnValue(true);
    }


}
