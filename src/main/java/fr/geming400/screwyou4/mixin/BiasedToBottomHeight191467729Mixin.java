package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight.class)
public class BiasedToBottomHeight191467729Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_961890758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961890758L))
            info.setReturnValue("|5@P\u4FAC][I\u28F6^\u1FCA|:\u6E86EA\u42D4#Vt3^8b\uA0FB\uA17E1\u5E55PsGc\u973ERDH\u4A12\u1420\u2079KE^q\"/{{\u0673LU&\u1153dhW^I*dV>9_pN\u80A9pj${");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/BiasedToBottomHeight;", cancellable = true)
    private static void of__615970243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615970243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_226572664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226572664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_1872852024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872852024L))
            info.setReturnValue(-380086009);
    }


}
