package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.MobCategory.class)
public class MobCategory1277218784Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__611628118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611628118L))
            info.setReturnValue("O^=31yqZ\uA55Aky!Br`D=|SSJGs\u03E0ieg?Q>t\u3D0D]Em.");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private static void values__807104262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807104262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private static void valueOf_202344833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202344833L))
            info.setReturnValue(net.minecraft.world.entity.MobCategory.MONSTER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1365427406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365427406L))
            info.setReturnValue("qp{|,\u0C9F\uB068YIX\u4E16{9jMs0i8IS#R|\uD14AE,@\uB162\u1040o* tT1iS4q`YS$Yg");
    }

    @Inject(at = @At("HEAD"), method = "getDespawnDistance()I", cancellable = true)
    private void getDespawnDistance__2033298963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033298963L))
            info.setReturnValue(-346712615);
    }

    @Inject(at = @At("HEAD"), method = "getNoDespawnDistance()I", cancellable = true)
    private void getNoDespawnDistance__1839275058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839275058L))
            info.setReturnValue(563534164);
    }

    @Inject(at = @At("HEAD"), method = "isPersistent()Z", cancellable = true)
    private void isPersistent_257380054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257380054L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDebugAbbreviation()Ljava/lang/String;", cancellable = true)
    private void getDebugAbbreviation__309019212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309019212L))
            info.setReturnValue("Eeb@s\u7085,J\uB4CD\"/]IX\u614Ay\uA2047`t4m1\uC250 G?");
    }

    @Inject(at = @At("HEAD"), method = "getMaxInstancesPerChunk()I", cancellable = true)
    private void getMaxInstancesPerChunk__246692250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246692250L))
            info.setReturnValue(1381316938);
    }

    @Inject(at = @At("HEAD"), method = "isFriendly()Z", cancellable = true)
    private void isFriendly_548931266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548931266L))
            info.setReturnValue(true);
    }


}
